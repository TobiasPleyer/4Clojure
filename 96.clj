;; Beauty is Symmetry - http://www.4clojure.com/problem/96
(fn is-symmetric [t]
  (let [left-tree-walk (fn ltw [t]
                         (if (not (sequential? t))
                           [t]
                           (let [[node left right] t]
                             (apply conj (conj (ltw left) node) (ltw right)))))
        right-tree-walk (fn rtw [t]
                         (if (not (sequential? t))
                           [t]
                           (let [[node left right] t]
                             (apply conj (conj (rtw right) node) (rtw left)))))
        [node left right] t]
    (= (left-tree-walk left) (right-tree-walk right))))
