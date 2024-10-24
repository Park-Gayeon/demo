package kr.co.itsmart.demo.DAO;

import kr.co.itsmart.demo.vo.SampleVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleDAO {
    SampleVO selectInfo();
}
