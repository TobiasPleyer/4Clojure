;; Global take-while - http://www.4clojure.com/problem/114
(fn [n p s]
  (let [helper (fn h [m p s]
                 (when-let [x (first s)]
                   (if (p x) 
                     (if (<= n m)
                       nil
                       (lazy-seq
                         (cons x (h (inc m) p (rest s)))))
                     (cons x (h m p (rest s))))))]
    (helper 1 p s)))
