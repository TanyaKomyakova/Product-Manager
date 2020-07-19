package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductManager manager = new ProductManager();
    private Smartphone first = new Smartphone("LG","dfsfg");
    private Product smart = new Product(1, "LG",23);





    @Test
    public void shouldBeFoundSmartphone(){// Следует найти смартфон


        manager.add(smart);

        Product[] actual = manager.searchBy("LG");
        Product[] expected = new Product[]{smart};
        assertArrayEquals(expected, actual);


    }


}