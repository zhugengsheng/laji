package wx.wx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wx.dao.QuestionInfoMapper;
import wx.wx.dao.UserMapper;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.UserInfoDTO;

@Service
public class QuestionInfoServiceImpl implements QuestionInfoService {

    @Autowired
    QuestionInfoMapper questionInfoMapper;

    @Override
    public QuestionInfo getQuestionInfo(int rubbishKind, String questionKind, int questionNum) {
        return questionInfoMapper.getQuestionInfo(rubbishKind,questionKind,questionNum);
    }


}
