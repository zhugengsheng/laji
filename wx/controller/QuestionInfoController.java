package wx.wx.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.UserInfoDTO;
import wx.wx.dto.result.QuestionInfoResult;
import wx.wx.dto.result.UserInfoResult;
import wx.wx.service.QuestionInfoService;
import wx.wx.service.UserService;

@RestController
@RequestMapping(value = "/questionInfo")
public class QuestionInfoController {

    @Autowired
    private QuestionInfoService questionInfoService;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/getQuestionInfo")
    public String getUserInfo(int rubbishKind, String questionKind, int questionNum) throws JsonProcessingException {

        QuestionInfo questionInfo = questionInfoService.getQuestionInfo(rubbishKind,questionKind,questionNum);
        if (questionInfo == null) {
            QuestionInfoResult questionInfoResult = new QuestionInfoResult();
            questionInfoResult.setCode(0);
            questionInfoResult.setMessage("无改类型问题");
            String userResult = objectMapper.writeValueAsString(questionInfoResult);
            return userResult;
        } else {
            QuestionInfoResult questionInfoResult = new QuestionInfoResult();
            questionInfoResult.setCode(0);
            questionInfoResult.setMessage("获取成功");
            questionInfoResult.setData(questionInfo);
            String questionReuslt = objectMapper.writeValueAsString(questionInfoResult);
            return questionReuslt;
        }
    }
}
