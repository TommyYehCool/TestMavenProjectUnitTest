package com.exfantasy.test;

import static com.exfantasy.test.matcher.FirstOddItems.firstOddItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import com.exfantasy.object.Guest;

public class TestHamcrestMatcher {

	@Test
	public void testGenerate() {
		Guest guest = new Guest();
		List<String> guests = guest.generate();
		assertThat(guests, firstOddItems("Tommy", "Alice", "Ally"));
	}
}
