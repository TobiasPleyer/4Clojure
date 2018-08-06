;; Oscilrate - http://www.4clojure.com/problem/144
(fn oscilrate [x & funcs]
  (let [helper (fn h [x fs]
                 (if-let [f (first fs)]
                   (let [fx (f x)]
                     (lazy-seq (cons fx (h fx (rest fs)))))
                   (h x funcs)))]
    (lazy-seq (cons x (helper x funcs)))))
