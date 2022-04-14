package com.sangbeom.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith; it's junit4
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;

//for junit 4
//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class) // junit5
@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Test
	public void contextLoads() {
	}

	@Test
	public void SQL세션_테스트() throws Exception{
		System.out.println(sqlSession.toString());
	}

}
