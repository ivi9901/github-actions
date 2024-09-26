package es.codeurjc.rest.items;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ItemsControllerTest {

	@Test
	public void postItemTest() throws Exception {

		// GIVEN

		ItemsRepository itemsRepository = new ItemsRepository();

		Item item = new Item();
		String itemDescription = "Tomate pero con un fallo";
		// esto era false
		boolean itemCheked = true;
		item.setDescription(itemDescription);
		item.setChecked(itemCheked);

		// WHEN

		Item postedItem = itemsRepository.postItem(item);
		
		// THEN

		assertThat(postedItem.getDescription()).isEqualTo(itemDescription);
	}

}
