package com.example.repository;

import com.example.domain.Post;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Delete;
import jakarta.data.repository.Repository;
import jakarta.transaction.Transactional;

import java.util.UUID;

@Repository
public interface PostRepository extends CrudRepository<Post, UUID> {

    @Delete
    @Transactional
    void deleteAll();
}
