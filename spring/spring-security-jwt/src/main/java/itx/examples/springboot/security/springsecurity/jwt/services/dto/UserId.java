package itx.examples.springboot.security.springsecurity.jwt.services.dto;

import java.util.Objects;

public class UserId {

    private final String id;

    public UserId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static UserId from(String id) {
        return new UserId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equals(id, userId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserId{" +
                "id='" + id + '\'' +
                '}';
    }

}
