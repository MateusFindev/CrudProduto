package org.example;

public interface Vendavel {
    static boolean verificarVendavel(ProdutoBase produtoBase) {
        boolean result = false;
        if (produtoBase.getEstoque() > 0) {
            result = true;
        }
        return result;
    };

}
