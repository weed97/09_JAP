package com.ohgiraffers.section06.join;

import com.ohgiraffers.section03.projection.BiDirectionCategory;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="menu_section06")
@Table(name="tbl_menu")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Menu {

    @Id
    @Column(name ="menu_code")
    private int menuCode;

    @Column(name="menu_name")
    private String menuName;


    @Column(name="menu_price")
    private int menuPrice;

    @ManyToOne
    @JoinColumn(name ="category_code")
    private Category category;

    @Column(name="orderable_status")
    private String orderableStatus;
}
