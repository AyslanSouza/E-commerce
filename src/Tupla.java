public class Tupla<A, B> {
    private A primeiro;
    private B segundo;

    public Tupla(A primeiro, B segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public A getPrimeiro() {
        return primeiro;
    }

    public B getSegundo() {
        return segundo;
    }
}
