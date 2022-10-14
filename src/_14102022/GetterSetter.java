package _14102022;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class GetterSetter {
    private String name;
    private int age;
}

class Main {
    public static void main(String[] args) {
        GetterSetter getterSetter = new GetterSetter("Mikhail", 38);
        System.out.println(getterSetter);
    }
}