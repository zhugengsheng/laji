package wx.wx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wx.dao.QuestionInfoMapper;
import wx.wx.dao.RubbishKindMapper;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.RubbishKind;

import java.util.List;

@Service
public class RubbishKindServiceImpl implements RubbishKindService {

    @Autowired
    RubbishKindMapper rubbishKindMapper;

    @Override
    public List<RubbishKind>  getRubbinshKind(int kindid) {
        return rubbishKindMapper.getRubbinshKind(kindid);
    }
}
