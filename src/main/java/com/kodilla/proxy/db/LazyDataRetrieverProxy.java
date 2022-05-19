package com.kodilla.proxy.db;

import java.util.Objects;

public class LazyDataRetrieverProxy implements DbDataRetriever {
    private DbDataRetriever retriever;

    @Override
    public int getFirstValue() throws InterruptedException {
        if (Objects.isNull(retriever))
            retriever = new PostgresDataRetriever();
        return retriever.getFirstValue();
    }

    @Override
    public int getSecondValue() throws InterruptedException {
        if (Objects.isNull(retriever))
            retriever = new PostgresDataRetriever();
        return retriever.getSecondValue();
    }

    @Override
    public int getThirdValue() throws InterruptedException {
        if (Objects.isNull(retriever))
            retriever = new PostgresDataRetriever();
        return retriever.getThirdValue();
    }
}
