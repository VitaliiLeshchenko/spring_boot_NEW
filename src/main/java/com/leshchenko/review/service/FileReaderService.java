package com.leshchenko.review.service;

import java.util.List;

/**
 *@param <T> the type of elements from which consist result of reading file.
 * Every implementation of this interface must be without generics.
 */
public interface FileReaderService<T> {
    List<T> getContent(String path);
}
