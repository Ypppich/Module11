package Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class SortedName {
    public static String getIndexedNames (List<String> names) {
        return IntStream.range(0, names.size()) //Створюємо потік чисел розміром нашого списку names.
                .filter(i -> i % 2 == 0) //Фільтруємо значення з потоку, щоб знайти єлементи які підходять під задачу (Вибрано парні числа, щоб потім правильно підставити значення для name.get(i) і не вийти за межі списку.
                .mapToObj(i -> (i + 1) + ". " + names.get(i)) //Вертаємо новий потік об’єктів з данними names які уже пронумеровані.
                .collect(Collectors.joining(", ")); //Виводимо рядок який містить елемнти що були оброблені потоком.
    }
}

class SortedNameTest {
    public static void main(String[] args) {
        SortedName sortedName = new SortedName();
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petro");
        names.add("Andriy");
        names.add("Anna");
        names.add("Diana");
        System.out.println(sortedName.getIndexedNames(names));
    }
}
