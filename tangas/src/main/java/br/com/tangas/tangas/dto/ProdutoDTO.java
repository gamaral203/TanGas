package br.com.tangas.tangas.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {


    private Long id;
    private String nome;
    private Integer quantidade;
    private BigDecimal preco;

}
