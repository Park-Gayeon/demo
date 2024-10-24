package kr.co.itsmart.demo.service;

import kr.co.itsmart.demo.DAO.SampleDAO;
import kr.co.itsmart.demo.vo.SampleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService{
    private final SampleDAO sampleDAO;

    @Override
    public SampleVO selectInfo(){
        return sampleDAO.selectInfo();
    }
}
