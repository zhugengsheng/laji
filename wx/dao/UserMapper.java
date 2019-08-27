package wx.wx.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import wx.wx.dto.UserInfoDTO;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM userinfo where userId = #{id}")
    public UserInfoDTO getUerInfoBy(String id);

    @Insert("INSERT INTO userinfo (userId,finishOne,finishTwo,finishThree,finishFour,score) VALUES (#{userInfoDTO.userId}, #{userInfoDTO.finishOne},#{userInfoDTO.finishTwo},#{userInfoDTO.finishThree},#{userInfoDTO.finishFour},#{userInfoDTO.score}")
    void insertUerInfo(UserInfoDTO userInfoDTO);

    @Update("UPDATE userinfo SET finishOne = #{userInfoDTO.finishOne}, finishTwo = #{userInfoDTO.finishTwo} , finishThree = #{userInfoDTO.finishThree} , finishFour = #{userInfoDTO.finishFour}, score = #{userInfoDTO.score}  WHERE userId = #{userInfoDTO.userId}")
    void  updateUerInfoBy(UserInfoDTO userInfoDTO);
}
