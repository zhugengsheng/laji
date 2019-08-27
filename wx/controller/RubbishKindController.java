package wx.wx.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.RubbishKind;
import wx.wx.dto.result.QuestionInfoResult;
import wx.wx.dto.result.RubbishKindResult;
import wx.wx.service.QuestionInfoService;
import wx.wx.service.RubbishKindService;

import java.util.List;

@RestController
@RequestMapping(value = "/rubbishKind")
public class RubbishKindController {

    @Autowired
    private RubbishKindService rubbishKindService;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/getRubbishKind")
    public String getRubbishKind(int kindid) throws JsonProcessingException {

        List<RubbishKind> rubbinshKind = rubbishKindService.getRubbinshKind(kindid);
        if (rubbinshKind == null) {
            RubbishKindResult rubbishKindResult = new RubbishKindResult();
            rubbishKindResult.setCode(0);
            rubbishKindResult.setMessage("无改类型问题");
            String rubbishResult = objectMapper.writeValueAsString(rubbishKindResult);
            return rubbishResult;
        } else {
            RubbishKindResult rubbishKindResult = new RubbishKindResult();
            rubbishKindResult.setCode(0);
            rubbishKindResult.setMessage("获取成功");
            rubbishKindResult.setData(rubbinshKind);
            String rubbishResult = objectMapper.writeValueAsString(rubbishKindResult);
            return rubbishResult;
        }
    }
}
