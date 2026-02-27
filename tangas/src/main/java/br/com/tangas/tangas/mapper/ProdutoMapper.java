package br.com.tangas.tangas.mapper;

import br.com.tangas.tangas.dto.ProdutoDTO;
import br.com.tangas.tangas.model.ProdutoModel;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public ProdutoModel map(ProdutoDTO produtoDTO) {
        ProdutoModel produtoModel = new ProdutoModel();
        produtoModel.setId(produtoDTO.getId());
        produtoModel.setNome(produtoDTO.getNome());
        produtoModel.setQuantidade(produtoDTO.getQuantidade());
        return produtoModel;
    }

    public ProdutoDTO map(ProdutoModel produtoModel) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setId(produtoModel.getId());
        produtoDTO.setNome(produtoModel.getNome());
        produtoDTO.setQuantidade(produtoModel.getQuantidade());
        return produtoDTO;
    }
}
