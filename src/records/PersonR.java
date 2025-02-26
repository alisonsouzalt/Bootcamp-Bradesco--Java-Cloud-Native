package records;

public record PersonR(String name, int age) {
    public void setName(String name){
        //records você não pode instanciar, a não ser que declare alguma variável no próprio.
    }
}
