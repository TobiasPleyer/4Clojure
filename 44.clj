;; Rotate Sequence - http://www.4clojure.com/problem/44
(fn rotate [n s]
  (let [cnt (count s)
        m (mod n cnt)]
    (take cnt (drop m (cycle s)))))
