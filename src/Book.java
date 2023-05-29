public class Book implements Inter {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public String vipName(String name) {
        if (name.length() < 5) {
            StringBuilder sb = new StringBuilder(name);
            sb.insert(2, "vip");
            return sb.toString();
        }
        if (name.length() > 5) {
            return name;
        }
        return null;
    }

    @Override
    public String vip(String name) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char lenght = name.charAt(i);
            if (i < name.length() - 1 && Character.toUpperCase(lenght) == Character.toUpperCase(name.charAt(i + 1))) {
                result.append(Character.toUpperCase(lenght));
            } else {
                result.append(lenght);
            }
        }
        return result.toString();

    }
}

