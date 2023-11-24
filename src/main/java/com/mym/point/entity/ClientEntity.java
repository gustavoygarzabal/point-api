package com.mym.point.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class ClientEntity {

    private static final String ID_SEQ = "client_id_client_id_seq";
    @Id
    @GeneratedValue(generator = ID_SEQ, strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = ID_SEQ, sequenceName = ID_SEQ, allocationSize = 1)
    private Integer clientId;

    private String name;
}