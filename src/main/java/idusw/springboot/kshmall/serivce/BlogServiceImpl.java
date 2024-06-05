package idusw.springboot.kshmall.serivce;
import org.springframework.stereotype.Service;
import idusw.springboot.kshmall.model.BlogDto;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Override
    public int create(BlogDto blogDto) {
        return 0;
    }

    @Override
    public BlogDto readByIdx(Long idx) {
        return null;
    }

    @Override
    public List<BlogDto> readAll() {
        return null;
    }

    @Override
    public int update(BlogDto blogDto) {
        return 0;
    }

    @Override
    public int delete(BlogDto blogDto) {
        return 0;
    }
}
