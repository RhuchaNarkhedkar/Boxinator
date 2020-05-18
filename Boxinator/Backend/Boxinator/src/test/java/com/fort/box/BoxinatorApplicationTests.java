package com.fort.box;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fort.box.dao.BoxDao;
import com.fort.box.model.Box;
import com.fort.box.service.BoxService;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoxinatorApplicationTests {

	@Spy
	@InjectMocks
	private BoxService service;

	@Mock
	private BoxDao repository;

	@Test
	public void getAllBoxes() throws SQLException {
		when(repository.getAllBoxes()).thenReturn(Stream
				.of(new Box("BoxA", 10, "#FF0000", "Sweden"), new Box("BoxB", 20, "#FFA500", "Brazil"))
				.collect(Collectors.toList()));
		assertEquals(2, service.getAllBoxes().size());
	}
	@Test
	public void addBox() throws SQLException {
		Box box= new Box("BoxC", 30, "#008000", "Australia");
		when(repository.addBox(box)).thenReturn(box);
		assertEquals(box, service.addBox(box));
	}

}
