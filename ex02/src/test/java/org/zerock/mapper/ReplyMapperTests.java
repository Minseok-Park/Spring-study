package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = {121L, 122L, 123L, 124L, 125L};
	
	@Setter(onMethod_ = {@Autowired})
	private ReplyMapper mapper;
	
	@Test
	public void test() {
		log.info(mapper);
	}
	
//	@Test
//	public void testCreate() {
//		
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			ReplyVO reply = new ReplyVO();
//			reply.setBno(bnoArr[i%5]);
//			reply.setReply("댓글 테스트" + i);
//			reply.setReplyer("replyer" + i);
//			
//			mapper.insert(reply);
//		});
//		
//	}
	
//	@Test
//	public void testRead() {
//		Long targetRno = 1L;
//		
//		 ReplyVO vo = mapper.read(targetRno);
//		 log.info(vo);
//	}
	
//	@Test
//	public void testDelete() {
//		Long targetRno = 1L;
//		
//		mapper.delete(targetRno);
//	}
	
//	@Test
//	public void testUpdate() {
//		ReplyVO vo = mapper.read(2L);
//		vo.setReply("Update Reply");
//		
//		int count = mapper.update(vo);
//		
//		log.info("UPDATE COUNT : " + count);
//		
//	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		
		List<ReplyVO> list =  mapper.getListWithPaging(cri, bnoArr[2]);
		list.forEach(reply -> log.info(reply));
	}
	

}















