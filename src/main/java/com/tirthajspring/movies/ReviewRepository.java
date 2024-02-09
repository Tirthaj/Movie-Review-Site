package com.tirthajspring.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.image.renderable.RenderableImage;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
}