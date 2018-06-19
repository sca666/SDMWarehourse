package xin.cymall.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;
import xin.cymall.entity.SysCode;
import xin.cymall.service.SysUserService;
import xin.cymall.utils.RRException;
import xin.cymall.utils.ShiroUtils;
import xin.cymall.utils.R;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import xin.cymall.vo.Login;

/**
 * 登录相关
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2016年11月10日 下午1:15:31
 */
@Controller
public class SysLoginController {
	@Autowired
	private Producer producer;
	@Autowired
	private SysUserService userService;
	private Login login;

	@RequestMapping("captcha.jpg")
	public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
	}
	
	/**
	 * 登录
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/login", method = RequestMethod.POST)
	public R login(@RequestBody Login login)throws IOException {
		System.out.println("old will action!");
		if(StringUtils.isEmpty(login.getCaptcha())||StringUtils.isEmpty(login.getUsername())||StringUtils.isEmpty(login.getPassword())){
			throw new RRException("参数不能为空");
		}
		String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
		if(!login.getCaptcha().equalsIgnoreCase(kaptcha)){
			return R.error("验证码不正确");
		}
		try{
			Subject subject = ShiroUtils.getSubject();
			//sha256加密
			String password = new Sha256Hash(login.getPassword()).toHex();
			UsernamePasswordToken token = new UsernamePasswordToken(login.getUsername(), password);
			subject.login(token);
			System.out.println("登录成功");
		}catch (UnknownAccountException e) {
			return R.error(e.getMessage());
		}catch (IncorrectCredentialsException e) {
			return R.error(e.getMessage());
		}catch (LockedAccountException e) {
			return R.error(e.getMessage());
		}catch (AuthenticationException e) {
			return R.error("账户验证失败");
		}
	    
		return R.ok();
	}
	
	/**
	 * 退出
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
		ShiroUtils.logout();
		return "redirect:login.html";
	}

	@ResponseBody
	@RequestMapping(value = "/sys/wxlogin",method = RequestMethod.POST)
	public R chatLogin(@RequestBody Login login) throws IOException{
		System.out.println("new will action!");
		try {
			Subject subject = ShiroUtils.getSubject();
			String password = new Sha256Hash(login.getPassword()).toHex();
			UsernamePasswordToken token = new UsernamePasswordToken(login.getUsername(),password);
			subject.login(token);
			System.out.println("Login successful");
		}catch (UnknownAccountException e) {
			return R.error(e.getMessage());
		}catch (IncorrectCredentialsException e) {
			return R.error(e.getMessage());
		}catch (LockedAccountException e) {
			return R.error(e.getMessage());
		}catch (AuthenticationException e) {
			return R.error("账户验证失败");
		}
		return R.ok();
	}



}
