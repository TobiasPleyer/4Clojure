;; Fibonacci Sequence - http://www.4clojure.com/problem/26
(fn [n]
  (let [lazy-fib (fn fib [a b]
                   (lazy-seq (cons a (fib b (+ a b)))))]
    (take n (lazy-fib 1 1))))
