package wx.wx.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import wx.wx.dto.QuestionInfo;
import wx.wx.dto.UserInfoDTO;

@Mapper
public interface QuestionInfoMapper {
    @Select("SELECT * FROM questioninfo where rubbishKind = #{rubbishKind} and questionKind = #{questionKind} and questionNum = #{questionNum}")
    public QuestionInfo getQuestionInfo(int rubbishKind,String questionKind,int questionNum);

}
