;; Beauty is Symmetry - http://www.4clojure.com/problem/96
(fn is-symmetric [t]
  (let [sym-tree-walk (fn stw [t]
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
                          (apply conj (conj (left-tree-walk left) node) (reverse (right-tree-walk right)))))
        walked-tree (sym-tree-walk t)]
    (= walked-tree (reverse walked-tree))))
