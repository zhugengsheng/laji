package wx.wx.service;

import org.springframework.stereotype.Component;
import wx.wx.dto.UserInfoDTO;


public interface UserService {

    public UserInfoDTO getUerInfoBy(String id);
    void insertUerInfo(UserInfoDTO userInfoDTO);
    void  updateUerInfoBy(UserInfoDTO userInfoDTO);
}
