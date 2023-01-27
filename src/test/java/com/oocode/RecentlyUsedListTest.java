//The Recently Used List
//		This is a list of items such as recently dialled numbers on your phone, or
//		recently opened files in an application on your computer.
//		• The list should be empty when initialised.
//		• We should be able to add things to the list.
//		• We should be able to retrieve items from the list.
//		• The most recent item should be first in the list.
//		• Items in the list are unique, so duplicate insertions should be moved
//		rather than added.
//		Are there any error cases to consider? What types of object can your list
//		hold?


package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {
	@Test
	public void isEmptyWhenInitialised() {
		assertThat(new RecentlyUsedList().isEmpty(),equalTo(true));
	}
}
