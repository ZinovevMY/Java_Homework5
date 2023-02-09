import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
public class Homework {

    public static void main(final String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        ArrayList<String> employees = new ArrayList<>();
        Map<String, Integer> names = new HashMap<>();
        phonebook.put("88001122333", "Иван Иванов");
        phonebook.put("88001662333", "Иван Курицин");
        phonebook.put("88001112333", "Иван Курицин");
        phonebook.put("88001122432", "Иван Незлобин");
        phonebook.put("88001112453", "Сергей Потапов");
        phonebook.put("8800163214", "Сергей Потапов");
        phonebook.put("8800142421", "Сергей Курицин");
        phonebook.put("880012343", "Михаил Незлобин");

        int name_counter = 0;
        String first_name = "";
        for (String val: phonebook.values()){
            if(!employees.contains(val)){
                employees.add(val);
            }
        }
        for (String name: employees){
            name_counter = 0;
            first_name = name.substring(0, name.indexOf(" "));
            for (String rec: employees){
                if (rec.contains(first_name)){
                    name_counter++;
                }
            }
            if (name_counter > 1){
                names.put(first_name, name_counter);
            }
        }

        names.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}
