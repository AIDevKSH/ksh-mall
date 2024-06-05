package idusw.springboot.kshmall.serivce;

import idusw.springboot.kshmall.entity.BlogEntity;
import idusw.springboot.kshmall.entity.MemberEntity;
import idusw.springboot.kshmall.model.BlogDto;


import java.util.List;

public interface BlogService {

    int create(BlogDto blogDto);
    BlogDto readByIdx(Long idx);
    List<BlogDto> readAll();
    int update(BlogDto blogDto);
    int delete(BlogDto blogDto);

    static BlogEntity dtoToEntity(BlogDto dto) {

        MemberEntity member = MemberEntity.builder()
                .idx(dto.getWriterIdx())
                .build();
        BlogEntity entity = BlogEntity.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .views(dto.getViews())
                .writer(member)
                .build();
        return entity;
    }
    // MemberEntity -> : Controller에서는 Member를 다룸
    default BlogDto entityToDto(BlogEntity entity, MemberEntity member) {
        BlogDto dto = BlogDto.builder()
                .bno(entity.getBno())
                .title(entity.getTitle())
                .views(entity.getViews())
                .content(entity.getContent())
                .writerIdx(member.getIdx())
                .writerName(member.getName())
                .writerEmail(member.getEmail())
                .regDate((entity.getRegDate()))
                .modDate(entity.getModDate())
                .build();
        return dto;
    }
}
