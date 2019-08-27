package wx.wx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import wx.wx.dao.UserMapper;
import wx.wx.dto.UserInfoDTO;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserInfoDTO getUerInfoBy(String id) {
        return userMapper.getUerInfoBy(id);
    }

    @Override
    public void insertUerInfo(UserInfoDTO userInfoDTO) {
        userMapper.insertUerInfo(userInfoDTO);
    }

    @Override
    public void updateUerInfoBy(UserInfoDTO userInfoDTO) {
        userMapper.updateUerInfoBy(userInfoDTO);
    }
}
