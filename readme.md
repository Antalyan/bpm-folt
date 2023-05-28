Setup intructions
=======================
Important note: default branch must be **master**, not **main**

### How to share it with others
1. **git clone https://github.com/peter-sipos/FOLT.git** (locally, first person uses **git init**)
2. **cd FOLT**
3. **create a namespace FOLT in jbpm**
4. **import project -> paste https://github.com/peter-sipos/FOLT.git** (no authentication info needed)
5. **git remote add business-central ssh://wbadmin@localhost:8001/FOLT/FOLT**

### How to make changes 

1. **do changes in jbpm platform** (do not forget to click on save)
2. **git pull business-central master** (password wbadmin)
3. **git push**

### How to download changes 
1. **git pull**
2. **git push business-central master** (password wbadmin)
