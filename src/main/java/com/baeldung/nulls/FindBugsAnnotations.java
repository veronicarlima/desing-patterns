package com.baeldung.nulls;
import lombok.NonNull;

import javax.annotation.Nullable;

public class FindBugsAnnotations {

    public void accept(@NonNull Object param) {
        System.out.println(param.toString());
    }

    public void print(@Nullable Object param) {
        System.out.println("Printing " + param);
    }

    @NonNull
    public Object process() throws Exception {
        Object result = doSomething();
        if (result == null) {
            throw new Exception("Processing fail. Got a null response");
        } else {
            return result;
        }
    }

    private Object doSomething() {
        return null;
    }
}
