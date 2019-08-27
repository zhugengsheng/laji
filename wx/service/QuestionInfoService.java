package wx.wx.service;

import wx.wx.dto.QuestionInfo;


public interface QuestionInfoService {

    public QuestionInfo getQuestionInfo(int rubbishKind,String questionKind,int questionNum);

}
