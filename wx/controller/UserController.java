package wx.wx.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.wx.dto.UserInfoDTO;
import wx.wx.dto.result.UserInfoResult;
import wx.wx.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(String openId) throws JsonProcessingException {

        UserInfoDTO userInfoDTO = userService.getUerInfoBy(openId);
        if (userInfoDTO == null) {
            UserInfoResult userInfoResult = new UserInfoResult();
            userInfoResult.setCode(0);
            userInfoResult.setMessage("新用户");
            UserInfoDTO userInfoDTO1 = new UserInfoDTO(openId, 0, 0, 0, 0, 0);
            userInfoResult.setData(userInfoDTO1);
            String userResult = objectMapper.writeValueAsString(userInfoResult);
            return userResult;
        } else {
            UserInfoResult userInfoResult = new UserInfoResult();
            userInfoResult.setCode(0);
            userInfoResult.setMessage("获取成功");
            userInfoResult.setData(userInfoDTO);
            String userResult = objectMapper.writeValueAsString(userInfoResult);
            return userResult;
        }
    }
}
