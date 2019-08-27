package wx.wx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.RubbishKind;

import java.util.List;

@Mapper
public interface RubbishKindMapper {
    @Select("SELECT * FROM rubbishkind where rubbishkind = #{kindid} ")
    public List<RubbishKind> getRubbinshKind(int kindid);

}
