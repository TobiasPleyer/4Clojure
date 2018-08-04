;; Reimplement Trampoline - http://www.4clojure.com/problem/78
(fn [f & args]
  (loop [result (apply f args)]
    (if (fn? result)
      (recur (result))
      result)))
