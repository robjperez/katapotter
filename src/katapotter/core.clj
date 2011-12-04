(ns katapotter.core)

(defn
  price-for
  [number-of-books]
  (cond
    (= number-of-books 1) 8
    (= number-of-books 2) 15.2
    (= number-of-books 3) 21.6
    (= number-of-books 4) 28.8
    (= number-of-books 5) 30))

(defn 
  countReps
  [col reps]
  (count (filter #(>= (last %) reps) col)))  

(defn 
  reduceBasket
  [books]
  (let [fq (frequencies books) 
        maxIter (first (reverse (sort (vals (frequencies books)))))]
    (map #(countReps fq %) (range 1 (+ 1 maxIter)))))

(defn 
  calculate
  [books]
  (apply + (map #(price-for %) (reduceBasket books))))
 
;(def basket [1 1 2 2 3 3 4 5]) 
;(calculate basket)
