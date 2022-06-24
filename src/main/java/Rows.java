public enum Rows {
    DN("dn"),
    CREATETIMESTAMP("createtimestamp"),
    CREATORSNAME("creatorsname"),
    ENTRYCSN("entrycsn"),
    ENTRYDN("entrydn"),
    NAME("cn"),
    ENTRYUUID("entryuuid"),
    HASSUBORDINATES("HASSUBORDINATES");


    private final String name;

    private Rows(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
