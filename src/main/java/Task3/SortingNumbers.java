package Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingNumbers {
    public static String arraySortingNumbers (String[] numbers) {
        String result = Arrays.stream(numbers) //Створюємо змінну result у яку будуть записуватись данні з потоку.
                .flatMapToInt(i -> Arrays.stream(i.split(",\\s+")) //Розділення рядків масиву numbers та конвертація їх в числа, щоб відсортувати
                .mapToInt(Integer::valueOf))
                .sorted() //Сортування.
                .mapToObj(String::valueOf) //Перетворення назад до рядка.
                .collect(Collectors.joining(", ")); //Виводимо данні з потоку у result.
        return result;
    }
}


class SortingNumbersTest {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        System.out.println(new SortingNumbers().arraySortingNumbers(numbers));
    }
}