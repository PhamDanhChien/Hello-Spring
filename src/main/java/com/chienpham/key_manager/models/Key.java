package com.chienpham.key_manager.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "keys")
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "key_code")
    private String keyCode;

    @Column(name = "machine_serial")
    private String machineSerial;

    @Column(name = "expired_time")
    private Timestamp expiredTime;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Key key = (Key) o;
        return id != null && Objects.equals(id, key.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
