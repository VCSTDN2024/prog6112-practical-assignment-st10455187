# 🎬 Prog Series & Prog Properties v1.4 🏢



Welcome to **Prog Series & Prog Properties v1.3**!  
This Java cli-application helps manage **tenants, invoices, and multimedia series**.  
Version **1.4** introduces **automatic invoice export**, saving every invoice as a `.txt` file.

---
### 👩‍💻 Developer: Angel Maile
### 🔢 Student Number: ST10455187
### 🎓 Course: BCAD0701
### 📚 Module: PROG6121 1B
### 🏫 Group: 2
### 🔣 Programming Language: Java
### ✅ Automation Status:

[![Java CI](https://github.com/VCSTDN2024/prog6112-practical-assignment-st10455187/actions/workflows/test.yml/badge.svg)](https://github.com/VCSTDN2024/prog6112-practical-assignment-st10455187/tree/main/.github/workflows)

### Youtube Video:<br>
[![](https://github.com/user-attachments/assets/93407952-3c2d-42a0-b9a5-eb36013f5e2d)](https://youtu.be/5gGbNDaiwYQ)

---

<img width="50" height="50" alt="icons8-github-240" src="https://github.com/user-attachments/assets/483357b1-6b24-463f-8cf8-96f553616052" />
<img width="50" height="50" alt="icons8-java-240" src="https://github.com/user-attachments/assets/d70293ab-d733-43b0-9cdd-2d2092c0e287" />
<img width="50" height="50" alt="icons8-apache-netbeans-240" src="https://github.com/user-attachments/assets/a04be535-a5eb-4b1f-bd11-e25b012d9bfb" />

---


## 🚀 Project Overview

| Module | Description |
|--------|-------------|
| **Prog Properties** | Manage tenants, their details, and monthly invoices. |
| **Prog Series** | Manage multimedia series, age restrictions, and episodes. |
| **Prog Assignment** | Main launcher to choose between **Properties** or **Series**. |

### 💡 Key Features

#### Prog Properties
- 📝 Capture, update, search, and remove tenants.  
- 💰 Generate, edit, search, and delete invoices.  
- 📊 Print reports for all tenants and invoices.  
- ✅ Validation for IDs, emails, apartment units, and bedroom types.  
- 🏠 Rent calculation based on bedroom type.
- 📂 **NEW in v1.4:** Automatic export of invoices.

#### Prog Series
- 🆕 Capture new series.  
- ✏️ Update, delete, and search series by ID.  
- 📈 Display a full report of all series.  
- 🎯 Validation for series ID, name, age (2–18), and episodes.

---

## 🧬 Where I applied the concept of Inheritance

```text
Resident (superclass)
│
├── Tenant
└── Invoice

Resident contains fields: tenantId, tenantName, apartmentUnit, rent.
Tenant and Invoice inherit these fields.
Rent updates automatically when bedroom type changes (thanks to Copilot 👨‍💻).
```

## 📁 Project Structure
```text
prog6121-assignment/
│
├── src/
│   ├── ProgProperties/
│   │   ├── Invoice.java 
│   │   ├── PropertyApp.java  
│   │   ├── Resident.java  
│   │   ├── Tenant.java     
│   │   └── TenantManager.java  
│   │
│   ├── ProgrammingAssignment/
│   │   └── ProgAssignment.java  
│   │
│   └── ProgSeries/
│       ├── Series.java  
│       ├── SeriesApp.java 
│       └── SeriesModel.java 
│
└── test/
    ├── ProgProperties/
    │   └── TenantManagerTest.java 
    │
    └── ProgSeries/
        └── SeriesTest.java
```

## ⏳ Project Timeline

| Date | Milestone |
|------|-----------|
| 20 Aug 2025 | Project started. Planning structure and modules. |
| 23 Aug 2025 | Designed Tenant and Invoice classes with fields and constructors. |
| 25 Aug 2025 | Implemented SeriesModel and Series classes with CRUD operations. |
| 28 Aug 2025 | Integrated ProgAssignment main launcher. |
| 1 Sep 2025 | Added validation for all input fields and age restrictions. |
| 2 Sep 2025 | Implemented invoice generation and display reports. |
| 9 Sep 2025 | Added inheritance (Resident superclass) and rent calculation fixes. |
| 10 Sep 2025 | Final improvements, bug fixes, testing, and documentation. |

## 🧩 Challenges Faced

**Rent Update Issue:**
When updating bedroom type, rent did could not update.
Copilot helped implement rent recalculation in the Tenant class.

**Invoice Display Limitation:**
Generating multiple invoices for the same tenant worked,
but searching displayed only the first invoice. This needs improvement for multiple invoice handling.

**ID Generation:**
Current system allows multiple tenants or series with the same ID,
which can lead to conflicts.

## 🔧 Areas of Improvement

| Feature | Improvement Needed |
|---------|-------------------|
| ID Generation | Ensure unique IDs for tenants and series. |
| Invoice Generation | Display all invoices for a tenant when searching. |
| Validation | Add more advanced input handling for different cases. |
| UI | Implement a better menu interface, possibly GUI. |
| Data Storage | Consider file or database storage instead of memory-only ArrayLists. |

## 🎓 What I Learned

- How to design and implement Java classes with inheritance.
- Managing multiple objects using ArrayList.
- Implementing CRUD operations for real-world scenarios.
- Using validation to ensure correct user input.
- Generating invoices and calculating totals with VAT and levies.
- Debugging and improving code using tools like Copilot.
- Planning a project with timelines, milestones, and testing phases.

## 📄 References

Farrell, J. (2019). Java Programming. 9th ed. Boston: Cengage Learning. [Accessed 30 August 2025].

Kubjana S.K. 2025. Learning Unit 2 - Introduction to Inheritence. (Lecture Slides). PROG6121. Varsity College. Available at: [https://mystudies.iie.edu.za/d2l/le/lessons/47810/topics/3388760] (Accessed Date 01 September 2025). 

Kubjana S.K. 2025. Learning Unit 4 - Exception Handling. (Lecture Slides). PROG6121. Varsity College. Available at: [https://mystudies.iie.edu.za/d2l/le/lessons/47810/topics/3388765] (Accessed Date 09 September 2025). 


Copilot. (2025). GitHub Copilot (GPT-4.1 version). https://copilot.github.com [Accessed 9 September 2025].

## 📝 Notes

This project was developed between 20 August 2025 and 2 September 2025,
with an extension period until 10 September 2025.

Future versions may include GUI, unique ID enforcement, storage features and many more...
